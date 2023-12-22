import java.util.*;
import java.io.*;
import java.time.Year;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        PrintWriter pw = new PrintWriter(System.out);
        for(int i=1;i<=N;i++){
            int count = 0;
            for(int x=1;x*x<=N;x++){
                for(int y=x;y*y<=N;y++){
                    for(int z=y;z*z<=N;z++){
                        if(x*x+y*y+z*z+x*y+y*z+z*x==i){
                            if(x==y && y==z){
                                count++;
                            }else{
                                count += 3;
                            }
                            
                        }
                    }
                }
            }    
            pw.println(count);
        }
        pw.flush();
    }
}
