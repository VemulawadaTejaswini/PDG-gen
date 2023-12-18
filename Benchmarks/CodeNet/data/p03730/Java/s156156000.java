import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int i=0;
int[] nums=new int[3];
for(i=0;i<3;i++){nums[i]=sc.nextInt();}
System.out.println(Main.rtn(nums[0],nums[1],nums[2]));
}
static String rtn(int a,int b,int c){
a=((int)((a-1)/b)+1)*b-a;
if(c%a==0)return "YES";
if(a<=0)return "NO";
return rtn(a,b,c);
}
}