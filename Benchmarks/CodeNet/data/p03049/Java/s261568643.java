import java.util.*;

class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] str=new String[N];
        sc.nextLine();
        for(int i=0;i<N;i++){
            str[i] = sc.nextLine();
        }

        int max_AB = 0;
        int[] checkA=new int[str.length];
        int[] checkB=new int[str.length];
        for(int i=0;i<str.length;i++){
            if(str[i].substring(0, 1).equals("B")){
                checkB[i]=1;
            }
            if(str[i].substring(str[i].length()-1, str[i].length()).equals("A")){
                checkA[i]=1;
            }
            for(int j=0;j<str[i].length();j++){
                if(str[i].substring(j, j+2).equals("AB")){
                    max_AB++;
                }
            }
        }
        for(int i=0;i<str.length;i++){
            if(checkA[i]==1){
                for(int j=0;j<str.length;j++){
                    if(i==j)continue;
                    if(checkB[j]==1){
                        checkB[j]=checkB[i];
                        checkA[i]=0;
                        checkB[i]=0;
                        max_AB++;
                        break;
                    }
                }
            }
        }
        System.out.println(max_AB);
    }
}