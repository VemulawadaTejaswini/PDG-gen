import java.util.*;

class Main{
    public static void main(String[] args){
        int tmp = -1;
        int max = 0;
        Scanner sc = new Scanner(System.in);

        int bnum = sc.nextInt();
        String[] bstr = new String[bnum];
        for(int i=0;i<bnum;i++){
            bstr[i]=sc.next();
        }
        int rnum = sc.nextInt();
        String[] rstr  =new String[rnum];
        for(int i=0;i<rnum;i++){
            rstr[i]=sc.next();
        }
        sc.close();

        for(int i=0;i<bnum;i++){
            for(int j=0;j<bnum;j++){
                tmp += (bstr[i]==bstr[j])?1:0;
            }
            for(int k=0;k<rnum;k++){
                tmp += (bstr[i]==rstr[k])?-1:0;
            }
        }
        max = Math.max(max,tmp);
        System.out.print(max);
    }
}