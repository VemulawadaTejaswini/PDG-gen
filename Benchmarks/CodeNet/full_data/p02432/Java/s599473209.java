import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        Mydeque A = new Mydeque(N);

        for(int i=0;i<N;i++){
            int order = sc.nextInt();
            int d;
            switch (order){
                case 0:
                    d = sc.nextInt();
                    int x = sc.nextInt();
                    if(d == 0)A.addFirst(x);
                    if(d == 1)A.addLast(x);
                    break;
                case 1:
                    int p = sc.nextInt();
                    System.out.println(A.getData(p));
                    break;
                case 2:
                    d = sc.nextInt();
                    if(d == 0)A.removeFirst();
                    if(d == 1)A.removeLast();
                    break;
            }
            sc.nextLine();
        }
        sc.close();
    }
}
class Mydeque{
    int data[];
    int headindex; //head factor is null
    int lastindex; //last factor is null
    Mydeque(int N){
        data = new int[N*4];
        headindex = data.length / 2;
        lastindex = headindex + 1;
    }
    void addFirst(int x){
        data[headindex--] = x;
    }
    void addLast(int x){
        data[lastindex++] = x;
    }
    void removeFirst(){
        data[++headindex] = 0;
    }
    void removeLast(){
        data[--lastindex] = 0;
    }
    int getData(int index){
        return data[headindex+1+index];
    }
}
