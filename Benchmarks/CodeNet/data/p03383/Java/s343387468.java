import java.util.Scanner;

class Main{

    static boolean check(int[] a, int[] b){
        for(int i=0;i<26;++i)if(a[i]!=b[i])return false;
        return true;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int W = scan.nextInt();
        int[][] mat = new int[H][W];
        for(int i=0;i<H;++i){
            String s = scan.next();
            for(int j=0;j<W;++j)mat[i][j]=s.charAt(j)-'a';
        }
        int vcnt[][] = new int[H][26];
        for(int i=0;i<H;++i){
            for(int j=0;j<W;++j)vcnt[i][mat[i][j]]++;
        }
        boolean pared[] = new boolean[H];
        int pcnt = 0;
        for(int i=0;i<H;++i){
            if(pared[i])continue;
            for(int j=i+1;j<H;++j){
                if(check(vcnt[i], vcnt[j])){
                    pared[i]=true;
                    pared[j]=true;
                    ++pcnt;
                    break;
                }
            }
        }
        if(pcnt<H/2){
            System.out.println("NO");
            return;
        }
        int hcnt[][] = new int[W][26];
        for(int j=0;j<W;++j){
            for(int i=0;i<H;++i)hcnt[j][mat[i][j]]++;
        }
        pared = new boolean[W];
        pcnt = 0;
        for(int j=0;j<W;++j){
            if(pared[j])continue;
            for(int k=j+1;k<W;++k){
                if(check(hcnt[j],hcnt[k])){
                    pared[j]=pared[k]=true;
                    ++pcnt;
                    break;
                }
            }
        }
        if(pcnt<W/2){
            System.out.println("NO");
            return;
        }
        System.out.println("YES");


    }
}