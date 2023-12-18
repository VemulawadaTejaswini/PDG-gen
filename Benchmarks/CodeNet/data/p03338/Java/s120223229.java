import java.util.Scanner;

class 	Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int size = str.length();
        String[] array = str.split("");
        //System.out.println(array[0]);
        int count = 0;
        for(int i=0;i<array.length;i++){
            for(int j =0;j<array.length;j++){
                if(array[i].equals(array[j])&&(i!=j)){
                    count++;
                    //break;
                }
            }
           // System.out.println(count);

        }
        System.out.println(count-size);
    }
}