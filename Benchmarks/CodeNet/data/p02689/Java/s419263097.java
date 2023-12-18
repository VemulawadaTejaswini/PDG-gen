import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String l=s.nextLine();
        String[] in=l.split(" ");
        int ob=Integer.parseInt(in[0]);
        int road=Integer.parseInt(in[1]);
        l=s.nextLine();
        String[] hString=l.split(" ");
        int[] obh=new int[ob];
        boolean[] obGood=new boolean[ob];
        boolean[] obExit=new boolean[ob];
        for(int i=0;i<ob;i++){
            obh[i]=Integer.parseInt(hString[i]);
            obGood[i]=true;
            obExit[i]=false;
        }

        int j,k;
        for(int i=0;i<road;i++){
            l=s.nextLine();
            String[] line=l.split(" ");
            j=Integer.parseInt(line[0]);
            k=Integer.parseInt(line[1]);
            obExit[j-1]=true;
            obExit[k-1]=true;
            if(obh[j-1]>obh[k-1]){
                obGood[k-1]=false;
            }else {
                obGood[j-1]=false;
            }
        }

        int sum=0;
        for(int i=0;i<ob;i++){
            if(obGood[i] && obExit[i]){
                sum++;
            }
        }

        System.out.println(sum);
    }
}
