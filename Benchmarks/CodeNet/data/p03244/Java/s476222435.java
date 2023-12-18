import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int a[]=new int[100001];
  int b[]=new int[100001];
  for(int i=0;i<n;i++){
  	if(i%2==0)a[sc.nextInt()]++;
    else b[sc.nextInt()]++;
  }
  int amax=0,aamax=0,aind=0,aaind=0;
  for(int i=0;i<a.length;i++){
  	if(aind<a[i]){aamax=amax;
    	amax=i;
        aaind=aind;
        aind=a[i];
    }
  }
  int bmax=0,bbmax=0,bind=0,bbind=0;
  for(int i=0;i<b.length;i++){
  	if(bind<b[i]){bbmax=bmax;
    	bmax=i;
        bbind=bind;
        bind=b[i];
    }
  }
  if(bmax==amax){
  	System.out.println(Math.min(n-(aind+bbind),n-(aaind+bind)));
  }
  else{
  	System.out.println(n-aind-bind);
  }
}
}