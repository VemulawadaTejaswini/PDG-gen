import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int size = input.length();

        StringBuilder sb = new StringBuilder();
        boolean end;
        int cnt = 0;
        while(true){
            end = true;
            for(int i = size-3; i >= 0; i--){
                if(input.substring(i, i+3).equals("ABC")){
                    sb.setLength(0);
                    sb.append(input.substring(0, i));
                    sb.append("BCA");
                    sb.append(input.substring(i+3));
                    input = sb.toString();
                    end = false;
                    cnt++;
                }
            }
            if(end)break;
        }
        System.out.println(cnt);
    }
}

