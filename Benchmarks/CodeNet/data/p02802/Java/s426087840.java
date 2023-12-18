import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int nn=scan.nextInt();
int mm=scan.nextInt();
int[] na=new int[mm];
String[] nb=new String[mm];

int i=0;
for(i=0;i<mm;i++){
    na[i]=scan.nextInt();
    nb[i]=scan.next();
}

int[] first=new int[nn];
int[] wrong=new int[nn];

int j=0;
for(j=0;j<nn;j++){
    first[j]=0;
    wrong[j]=0;
}

for(i=0;i<mm;i++){
    if(nb[i].equals("AC")&&(first[na[i]-1]==0)){
        first[na[i]-1]=i+1;
    }
}

for(j=0;j<nn;j++){
    if(first[j]!=0){
        for(i=0;i<first[j];i++){
            if(nb[i].equals("WA")&&(na[i]==j+1)){
                wrong[j]=wrong[j]+1;
            }
        }
    }
}

int sum=0;
int summ=0;

for(j=0;j<nn;j++){
    if(first[j]!=0){
        sum=sum+1;
        summ=summ+wrong[j];
    }
}

System.out.println(sum+" "+summ);
}
}