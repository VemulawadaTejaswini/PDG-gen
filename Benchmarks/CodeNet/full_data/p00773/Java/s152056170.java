import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int x=Integer.parseInt(sc.next());
int y=Integer.parseInt(sc.next());
int s=Integer.parseInt(sc.next());
int max=0,temp=0;
for(int i=1;i<s;i++){
   for(int j=1;j<s;j++){
   if(i*(100+x)/100+j*(100+x)/100==s){
   temp=i*(100+y)/100+j*(100+y)/100;
   break;
   }
   }   
max=Math.max(temp,max);
}

System.out.println(max);
}
}

