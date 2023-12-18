import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     int M = sc.nextInt();
     ArrayList<ArrayList<int>> tree=new ArrayList<>() ;
     int element=0,X,Y,Z,ans=M;
     boolean containX,containY;
     for (int i=0;i<M;i++){
       containX = false;
       containY = false;
       X=sc.nextInt();
       Y=sc.nextInt();
       Z=sc.nextInt();
       for(int j=0;j<element;j++){
         if(tree.get(j).contains(X)){
           for(int k=0;k<element;k++){
             if(tree.get(k).contains(Y)){
               if(k==j){
                 containY = true;
                 break;
               }else{
                 tree.get(j).add(tree.get(k));
                 ans--;
                 containY = true;
                 break;
               }
             }
           }
           if(!containY){
             tree.get(j).add(Y);
              ans--;
           }
           containX = true;
           break;
         }
       }
       if(!containX){
         for(int k=0;k<element;k++){
           if(tree.get(k).contains(Y)){
              tree.get(k).add(X);
               containY = true;
               ans--;
               break;
             }
           }
         }
         if(!containX && !containY){
           tree.get(element).add(X);
           tree.get(element).add(Y);
         }
       }
       System.out.println(ans);
   }
}
