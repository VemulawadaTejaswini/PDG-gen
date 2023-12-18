import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        char S[],T[];
        Scanner input=new Scanner(System.in);
        S=input.next().toCharArray();
        T=input.next().toCharArray();
        int count=0;
        for(int i=0;i<3;i++)
        {
            if(S[i]==T[i])
            {
                
                count++;
            }
        }
        System.out.println(count);
    }
}