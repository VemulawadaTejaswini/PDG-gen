import java.util.*;
public class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String C[][]=new char[3][3];
String result="";
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
c[i][j]=sc.next();
}
}
for(int k=0;k<3;k++){
result+=c[k][k];
}
System.out.println(result);
}
}