import java.util.*; 

class Main{
  public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    int time=0; int count =0; int aa=0; int bb=0;
    int one =scn.nextInt();
    int two =scn.nextInt();
    int limit=scn.nextInt();
    int a[] = new int[one+1];
    int b[] = new int[two+1];
    for(int i=0;i<one;i++){
      a[i]=scn.nextInt();
    }
    a[one]=0;
    for(int i=0;i<two;i++){
      b[i]=scn.nextInt();
    }
    b[two]=0;
    while(time<=limit){
      if(a[aa]<b[bb]){
        time=time+a[aa];
        aa++;
      }else{
         time=time+b[bb];
         bb++;
      }
    count++;
    }   
    System.out.println(count-1);
  }
}