import java.util.Scanner;

class Main{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);

int[] buf=new int[3];

for(int i=0;i<buf.length;i++){
    buf[i]=sc.nextInt();
}

int work;
for(int i=0;i<buf.length;i++){
   for(int j=0;j<buf.length-i-1;j++){
       if(buf[j]>buf[j+1]){
            work=buf[j];
            buf[j]=buf[j+1];
            buf[j+1]=work;
       }
   }
}


System.out.print(buf[0]+" "+buf[1]+" "+buf[2]+\n);

sc.close();
}

}
