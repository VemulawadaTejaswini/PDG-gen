


import java.io.*;
import java.util.*;

public static void main(String args[]) throws Exception
					{
							Scanner cin=new Scanner(System.in);
							int a=cin.nextInt(),b=cin.nextInt();
							 for(int i=(a<=b)?a:b;i>=1;i--){
										if(a%i==0 && b%i==0) System.out.println(i);
									}
							
					}	
