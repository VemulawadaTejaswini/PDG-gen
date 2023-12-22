import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=new int[n][10];
for(int i=0;i<n;i++){
for(int j=0;j<10;j++){
k[i][j]=sc.nextInt();
}
}
for(int g=0;g<n;g++){
if(dfs(g,0,0,0,k)==true){System.out.println("YES");}
else{System.out.println("NO");}
}
}
public static boolean dfs(int i,int j,int r,int l,final int[][] k){
if(j==10){return true;}
else if(k[i][j]>r&&k[i][j]>l){
if(r>l){r=k[i][j];}
else{l=k[i][j];}
}
else if(k[i][j]>r){r=k[i][j];}
else if(k[i][j]>l){l=k[i][j];}
else{return false;}
return dfs(i,j+1,r,l,k);
}
}