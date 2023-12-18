import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
  public static void main (String[] args){

	int[] data = new int[3];
	int[] MAX = new int[3];
	int max = 0;
	int tmp = 0;
	Scanner sc = new Scanner (System.in);
		data[0]=sc.nextInt();
		data[1]=sc.nextInt();
		data[2]=sc.nextInt();

	for(int i = 0; i < data.length; i++)
		max = Math.max(max,data[i]);

	for(int i = 0; i < data.length; i++){
		if(data[i] != max){
			tmp += data[i];
		}
	}

	max = max * 10;

	MAX[0] = max + data[1] + data[2];
	MAX[1] = data[0] + max + data[2];
	MAX[2] = data[0] + data[1] + max;

	for(int i = 0; i < MAX.length; i++)
		max = Math.max(max,MAX[i]);

		System.out.println(max);

  }

}