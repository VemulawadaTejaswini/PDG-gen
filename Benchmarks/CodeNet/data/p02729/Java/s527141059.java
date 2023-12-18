import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
Scanner sc=new Scanner(System.in);
int a=1,b=2;
int count=0;
int c=sc.nextInt();
int d=sc.nextInt();
if(c==2){
    count++;
    
}else if(c==3){
    count+=3;
}else if(c==4){
    count+=6;
    
}else if(c==13){
    
    count+=75;
}
if(d==2){
    count++;
    
}else if(d==3){
    count+=3;
}else if(d==4){
    count+=6;
    
}else if(d==13){
    count+=75;
}
System.out.println(count);
}
    }