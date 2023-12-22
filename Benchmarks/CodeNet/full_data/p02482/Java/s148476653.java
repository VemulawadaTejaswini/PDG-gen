public class Main {

public static void main(String[] args) {

int f[100],i=2;

f[0]=0;

f[1]=1;

System.out.printf("F[0]=%d\nF[1]=%d\n",f[0],f[1]);

while(f[i]<10000){

f[i]=f[i-1]+f[i-2];

printf("F[%d]=%d\n",i,f[i]);

i++;

}

}

}