import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    String b = sc.next();
    if(a<0||a>10000) return;
    if(b.length()!=a) return;
    for(int i=0;i<a;i++){
      if(Character.isLowerCase(b.charAt(i))){}else return;
    }
    int limit = (int)Math.pow(2,a);
    int count=0;
    for(int i=1;i<limit;i++){
      String bistr = Integer.toBinaryString(i);
      if(bistr.length()!=a){
        int hokan = a-bistr.length();
        for(int nanka = 0;nanka<hokan;nanka++) bistr="0"+bistr;
      }
      String substr ="";
      for(int j=0;j<a;j++){
        if(bistr.charAt(j)=='1') substr+= b.charAt(j);
      }
      int substrlength = substr.length();
      boolean flag = false;
      for(int k=0;k<substrlength;k++){
        for(int l=k+1;l<substrlength;l++){
          if(substr.charAt(k)==substr.charAt(l)) flag=true;
        }
      }
      if(flag)continue;else count++; 
    }
    System.out.println(count);
  }
}