import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int people= scn.nextInt();
        int day = scn.nextInt();
        int x = scn.nextInt();
        int total = 0;
        for(int i=0;i<people;i++){
            int buf = scn.nextInt();
            for(int j=1;j<=day;){
                total++;
                j+=buf;
            }
        }
        System.out.println(total+x);
    }
}