import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i,j;
        String w[]=new String[n];
        for(i=0;i<n;++i)w[i]=sc.next();
        sc.close();
        for(i=0;i<n-1;++i){
            for(j=i+1;j<n;++j){
                if(w[i].equals(w[j])){
                    System.out.print("No");
                    System.exit(0);
                }
            }
        }
        for(i=1;i<n;++i){
            if(w[i-1].charAt(w[i-1].length()-1)!=w[i].charAt(0)){
                System.out.print("No");
                System.exit(0);
            }
        }
        System.out.print("Yes");
    }
}