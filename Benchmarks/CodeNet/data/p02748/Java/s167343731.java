import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b =sc.nextInt(),m=sc.nextInt();
        int[] an = new int[a];
        int[] bn = new int[b];
        int[] x = new int[m];
        int[] y = new int[m];
        int[]c = new int[m];
        for(int i = 0;i<a;i++){
            an[i] = sc.nextInt();
        }
        for(int i = 0;i<b;i++){
            bn[i] = sc.nextInt();
        }
        for(int i = 0;i<m;i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i =0;i<a;i++){
            for(int j =0;j<b;j++){
                for(int k =0;k<m;k++){
                    if((i+1==x[k])&&(j+1==y[k])){
                        list.add(an[i]+bn[j]-c[k]);
                    } else {
                        list.add(an[i]+bn[j]);
                    }
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}