import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int a=scan.nextInt();
    int b=scan.nextInt();
    int c=scan.nextInt();
    int l[]=new int[8];
    for(int i=0;i<8;i++){
      l[i]=0;
    }
    for(int i=0;i<n;i++){
      l[i]=scan.nextInt();
    }
    int x[]=new int[4]
    int min=114514810;
    for(int d=0;d<4;d++){
    for(int e=0;e<4;e++){
    for(int f=0;f<4;f++){
    for(int g=0;g<4;g++){
    for(int h=0;h<4;h++){
    for(int i=0;i<4;i++){
    for(int j=0;j<4;j++){
    for(int k=0;k<4;k++){
      x[0]=0;
      x[1]=0;
      x[2]=0;
      x[3]=0;
      x[d]+=l[0];
      x[e]+=l[1];
      x[f]+=l[2];
      x[g]+=l[3];
      x[h]+=l[4];
      x[i]+=l[5];
      x[j]+=l[6];
      x[k]+=l[7];
      x[0]=Math.abs(x[0]-a);
      x[1]=Math.abs(x[1]-b);
      x[2]=Math.abs(x[2]-c);
      min=Math.min(min,x[0]+x[1]+x[2])
    }
    }
    }
    }
    }
    }
    }
    }
    System.out.println(min);
  }
}
