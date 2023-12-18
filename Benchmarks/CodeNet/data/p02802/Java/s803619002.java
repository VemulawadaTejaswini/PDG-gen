

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        if(M==0) {
        	System.out.println("0");
        	System.out.print("0");
        }
        int[] A = new int[100001];
        String[] S = new String[100];
        int sum = 0;
        for(int i = 0; i <= M-1; i++) {
        	A[i] = sc.nextInt();
        	S[i] = sc.next();
        }
        int waCount = 0;
        int acCount = 0;
        int proCount = 0;
        if(M != 0) {
        	if( N != 0) {
        		for(int i = 0; i <= N-1; i++) {
        			if(S[i + proCount] == "AC") {
        				proCount++;
        				if(acCount != 1) {
        					acCount++;
        				}
        				break;
        			}else {
        				waCount++;
        			}
        		}
        		System.out.println(acCount);
        		System.out.print(waCount);
        		
        	}
        }

    }
    }