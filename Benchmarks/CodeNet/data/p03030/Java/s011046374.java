import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Data[] list = new Data[n];
        //データの格納
        for(int i =0; i < n ; i++){
            Data data = new Data(i+1, sc.next(), sc.nextInt());
            list[i] = data;
        }
        //ソート
        Arrays.sort(list, new Comparator<Data>() {
            public int compare(Data data1, Data data2) {
                if (data1.getA().equals(data2.getA())){
                    return data2.getB() - data1.getB();
                }
                return data1.getA().compareTo(data2.getA());
            }
        });
        for(int l =0 ; l < n; l++) {
            System.out.println(list[l].getN());
        }



    }

}

class Data{
    private int N;
    private String A;
    private int B;
    public Data(int n, String a, int b){
        this.N = n;
        this.A = a;
        this.B = b;
    }
    public int getN(){
        return N;
    }
    public String getA() {
        return A;
    }
    public int getB(){
        return B;
    }
}

