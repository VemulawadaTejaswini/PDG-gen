import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
class Main{
	public static void main(String[] args) {
		InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
      	int x=in.nextInt(),y=in.nextInt(),c=0,new_x;
			new_x=x;
			if(y%2!=0 || y>x*4){
				System.out.println("No");
			}
			else{
				if(y%x==0)
					System.out.println("Yes");
				else{
					while(c<x){
						if(x%2!=0){
							y=y/2;
							x=x-1;
							c++;
						}
						else{
							if(y%x==0){
								c+=y/x;
								x=x-(y/x);
							}
						}
					}
					if(c==new_x)
						System.out.println("Yes");
					else{
						System.out.println("No");
					}
				}
			}
		}
	} 
