import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int cnt = 0;
        while(true){
            int index01 = input.indexOf("01");
            int index10 = input.indexOf("10");
            if(index01 > -1){
                input = input.substring(0, index01) + input.substring(index01 + 2);
                cnt += 2;
            }else if(index10 > -1){
                input = input.substring(0, index10) + input.substring(index10 + 2);
                cnt += 2;
            }else{
                break;
            }
        }
        System.out.println(cnt);
    }
}