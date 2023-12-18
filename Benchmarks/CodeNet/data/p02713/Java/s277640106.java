import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=0;
int c=1;
int d=1;
int e=1;
for(int i=1;i<=a;i++){
   for(int j=1;j<=a;j++){
       for(int k=1;k<=a;k++){
    if(c<=d&&c<=e){
        b+=c;
    }else if(d<=c&&d<=e){
        b+=d;
    }else{
        b+=e;
    }
    c+=1;
}
       c=1;
    d+=1;
}
    d=1;
    e+=1;
}
System.out.println(b);
}
}