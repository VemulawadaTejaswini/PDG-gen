import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
  	int[] al=new int[n];
    for(int a=0;a<n;a++){
    int b=sc.nextInt();
    al[a]=b;
    b=0;
    }
    int total=0;
    for(int c=0;c<n;c++){
      for(int d=0;d<n;d++){
        if(d!=c){
    total+=al[c]*al[d];}}
    }
    System.out.println(total/2);
    }
}

