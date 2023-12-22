public class Main {

public static void main(String[] args) {

int F[100],i=2;

F[0]=0;

F[1]=1;

System.out.printf("F[0]=%d\nF[1]=%d\n",F[0],F[1]);

while(F[i]<10000){

F[i]=F[i-1]+F[i-2];

printf("F[%d]=%d\n",i,F[i]);

i++;

}

}

}