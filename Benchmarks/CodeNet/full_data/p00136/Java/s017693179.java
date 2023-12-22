import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
      		double[] height = new double[n];
      		int[] rate = new int[6];
      		for(int i=0; i<n; i++){
			 	height[i] = sc.nextDouble();
              	if(height[i]<165){
                  rate[0] = rate[0]+1;
                }else if(height[i]<170){
                  rate[1] = rate[1]+1;
                }else if(height[i]<175){
                  rate[2] = rate[2]+1;
                }else if(height[i]<180){
                  rate[3] = rate[3]+1;
                }else if(height[i]<185){
                  rate[4] = rate[4]+1;
                }else{
                  rate[5] = rate[5]+1;
				}
            }
      		for(int i=0; i<6; i++){
              System.out.print(i+1+":");
              for(int j=0; j<rate[i]; j++){
			 		System.out.print("*");
              }
              System.out.println();
            }
    }
}

