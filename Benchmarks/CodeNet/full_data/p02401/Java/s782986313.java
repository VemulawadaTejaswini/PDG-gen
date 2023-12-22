import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            while(true){
                int a,b,c,d,e;
                int x,y;
                a=0;
                b=0;
                c=0;
                d=0;
                e=0;
               String line = reader.readLine();
                for(int i=0;i<5;i++){
                    switch(i){
                        case 0:
                        e = line.indexOf('?');
                        break;
                        case 1:
                        a = line.indexOf('+');
                        break;
                        case 2:
                        b = line.indexOf('-');
                        break;
                        case 3:
                        c = line.indexOf('*');
                        break;
                        case 4:
                        d = line.indexOf('/');
                        break;
                    }
                }
                if(e!=-1)
                break;
                else if(a!=-1){
                    StringTokenizer token1 = new StringTokenizer(line," + ");
                    x = Integer.parseInt(token1.nextToken());
                    y = Integer.parseInt(token1.nextToken());
                    System.out.println(x+y);
                }else if(b!=-1){
                    StringTokenizer token2 = new StringTokenizer(line," - ");
                    x = Integer.parseInt(token2.nextToken());
                    y = Integer.parseInt(token2.nextToken());  
                    System.out.println(x-y);
                }else if(c!=-1){
                    StringTokenizer token3 = new StringTokenizer(line," * ");
                    x = Integer.parseInt(token3.nextToken());
                    y = Integer.parseInt(token3.nextToken());
                    System.out.println(x*y);
                }else if(d!=-1){
                    StringTokenizer token4 = new StringTokenizer(line," / ");
                    x = Integer.parseInt(token4.nextToken());
                    y = Integer.parseInt(token4.nextToken());
                    System.out.println(x/y);
                }else 
                break;
            } 
        }catch(IOException e){
            System.out.println(e);
        }catch(NumberFormatException e){
System.out.println("The input number was not correct.");
        }
    }
}
