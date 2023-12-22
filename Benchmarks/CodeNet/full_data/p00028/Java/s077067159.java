import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	int[] num = new int[101];
	int max = 0;
	while(kbd.hasNext()){
	    int a = kbd.nextInt();
	    num[a]++;
	    if(max<num[a]) max = num[a];
	}
	for(int i=0; i<num.length; i++){
	    if(num[i]==max)
		System.out.println(i);
	}
    }
}