/*
 * 黒板に N 個の正の整数 A1,…,AN が書かれています．
 * 
 * すぬけ君は，黒板に書かれている整数がすべて偶数であるとき，次の操作を行うことができます．
 * 
 *     黒板に書かれている整数すべてを，2 で割ったものに置き換える．
 * 
 * すぬけ君は最大で何回操作を行うことができるかを求めてください．
 */

import java.util.Scanner;
    public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = Integer.parseInt(sc.next());
            int min = 0;
            int temp = 0;
            
            int x = Integer.parseInt(sc.next());
        	
        	while(x%2==0){
        		temp++;
        		x = x/2;
        	}
        	min = temp;
            
            for(int i=1; i<n; i++){
            	x = Integer.parseInt(sc.next());
            	temp = 0;
            	
            	while(x%2==0){
            		temp++;
            		x = x/2;
            	}
            	if(min>temp){
            		min = temp;
            	}
            }
            // 出力
            System.out.println(min);
            
            sc.close();
        }
    }
	