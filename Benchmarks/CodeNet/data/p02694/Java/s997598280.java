public class Main {

    public static void main(String[] args) {
        Scanner  yomi = new Scanner(System.in);
        int a = yomi.nextInt();
        int b=100;
        for(int i=1;b<a;i++){
            b=(int)(b*0.01);
            if (a<=b) System.out.println(i);
        }

    }
}