import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	long[] num = new long[n];
      	for(int i=0;i<n;i++){
          num[i] = sc.nextLong();
        }
      	
  long max = 0;
  boolean Noans = true;
  for(int i=0;i<num.length;i++){
    if( num[i] > max ){
      max = num[i];
    }
  }
  String s = Long.toBinaryString(max);
  boolean[] d = new boolean[ s.length() ];
  for(int i=0;i<d.length;i++){
    d[i] = true;
  }
  for(int i=2;i<num.length;i++){
    s = Long.toBinaryString( num[i] );
    for(int j=0;j<s.length();j++){
      int t = d.length - s.length() + j;
      if( ( d[t] && s.charAt(j) == '0' ) || ( !d[t] && s.charAt(j) == '1' ) ){
        d[t] = true;
      }else{
        d[t] = false;
      }
      //System.out.print( d[t] );
    }
    //System.out.println("ここまで"+i);
  }
  
  //System.out.println(a1+":"+a2+":"+d[0]+d[1]);
  
  for(int i=0;i<num[0];i++){
    String s1 = Long.toBinaryString( num[0] );
    String s2 = Long.toBinaryString( num[1] );
    boolean [] tmp = new boolean[d.length];
    for(int j=0;j<tmp.length;j++){
      tmp[j] = d[j];
    }
    
    for(int j=0;j<s1.length();j++){
      int t = d.length - s1.length() + j;
      if( ( tmp[t] && s1.charAt(j) == '0' ) || ( !tmp[t] && s1.charAt(j) == '1' ) ){
        tmp[t] = true;
      }else{
        tmp[t] = false;
      }
    }
    for(int j=0;j<s2.length();j++){
      int t = d.length - s2.length() + j;
      if( ( tmp[t] && s2.charAt(j) == '0' ) || ( !tmp[t] && s2.charAt(j) == '1' ) ){
        tmp[t] = true;
      }else{
        tmp[t] = false;
      }
    }
    boolean ans = true;
    for(int j=0;j<d.length;j++){
      if( !tmp[j] ){
        ans = false;
      }
    }
    if( ans ){
      System.out.println(i);
      Noans = false;
      break;
    }
    num[0]--;
    num[1]++;
    
  }
  if(Noans){
      System.out.println(-1);
    }

	}
}