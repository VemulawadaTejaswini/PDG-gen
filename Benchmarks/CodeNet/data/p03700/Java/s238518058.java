import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();


		int[] health = new int[n];

		for(int i=0; i<n; i++){
			health[i] = sc.nextInt();
		}

		int noOfExpl = 0;
		int i=0;
		while(i < health.length){
			if(health[i] > 0){
				health[i] -= a;
				for(int j=i+1; j<n; j++){
					if(health[j] > 0){
						health[j] -= b;
					}
				}
				noOfExpl++;
				for(int k=i+1; k<health.length; k++){
					if(health[k]<= a && health[k]> health[i]){
						int temp = health[i];
						health[i] = health[k];
						health[k] = temp;
					}
				}
			}else{
				i++;
			}
		}

		System.out.println(noOfExpl);
	}
}
