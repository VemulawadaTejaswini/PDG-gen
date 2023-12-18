
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Stack;

public class Main{
       
	public static void main(String[] args) {
		
            Scanner sdf = new Scanner(System.in);
            int t=1;
            next: while(t-->0){
                String ss=sdf.next();
                StringBuilder s=new StringBuilder(ss);
                int q=sdf.nextInt();
                while(q-->0){
                    int tt=sdf.nextInt();
                    if(tt==1){
                        s=s.reverse();
                    }
                    else{
                        int f=sdf.nextInt();
                        if(f==1){
                            String ts=sdf.next()+s.toString();
                            s=new StringBuilder(ts);
                        }
                        
                        else{
                            s=s.append(sdf.next());
                        }
                    }
                }
                System.out.println(s);
                
            }
        }

        
}