import java.util.*;
import java.lang.*;

class Main{
 public static void main(String args[]){
   Scanner scn = new Scanner(System.in);
   String str = scn.nextLine();
   String[] ar = str.split("");
   List<Integer> zero = new ArrayList<>();
   List<Integer> max = new ArrayList<>();
   if("<".equals(ar[0])){
     zero.add(0);
   }else{
     max.add(0);
   }
   for(int i = 0; i < ar.length-1; i ++){
     if(">".equals(ar[i]) && "<".equals(ar[i+1])){
       zero.add(i+1);
     }
     if("<".equals(ar[i]) && ">".equals(ar[i+1])){
       max.add(i+1);
     }
   }
   if(">".equals(ar[ar.length-1])){
     zero.add(ar.length);
   }else{
     max.add(ar.length);
   }
	List<Integer> sum = new ArrayList<>();
   if(max.get(0) == 0){
     sum.add(zero.get(0));
     if(max.size() != 1){
       for(int j = 1; j < max.size(); j++){
         int a = max.get(j) - zero.get(j-1);
         int b = max.get(j) - zero.get(j);
         if(Math.abs(a)>Math.abs(b)){
           sum.add(Math.abs(a));
           sum.add(Math.abs(b)-1);
         }else{
           sum.add(Math.abs(a)-1);
           sum.add(Math.abs(b));
         }
       }
     }
   }
   if(zero.get(0) == 0){
     for(int j = 0; j < max.size(); j++){
       int c = max.get(j) - zero.get(j);
       int d = 0;
       if(zero.size() > j+1){
         d = max.get(j) - zero.get(j+1);
       }
       if(Math.abs(c)>Math.abs(d)){
         sum.add(Math.abs(c));
         sum.add(Math.abs(d)-1);
       }else{
         sum.add(Math.abs(c)-1);
         sum.add(Math.abs(d));
       }
     }     
   }
   int ans = 0;
   for(int s:sum){
     for(int n = s; n > 0; n--){
       ans += n;
     }
   }
   System.out.println(ans);
 }
}