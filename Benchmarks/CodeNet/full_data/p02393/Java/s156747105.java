import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int change;
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int numC = sc.nextInt();
        /*numA<numB<numCとなるようにnumの中身を入れ替えていく*/
        if(numA>numB){          //A<Bに並べ替え
            change = numA;
            numA = numB;
            numB = change;
        }
        if(numB>numC){          //B<Cになるよう入れ替え
            change = numB;
            numB = numC;
            numC = change;
        }
        if(numA>numB){          //A<B<Cとなる
            change = numA;
            numA = numB;
            numB = change;
        }
        System.out.println(numA+" "+numB+" "+numC); //A B Cと出力
    }
}
