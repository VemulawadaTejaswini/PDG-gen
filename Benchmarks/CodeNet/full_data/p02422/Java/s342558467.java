import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int q = Integer.parseInt(scanner.nextLine());
        
        String tmp = str;
        for(int i=1; i<=q; i++){
            String input = scanner.nextLine();
            String inputArr[] = input.split(" ");
            
            int a = 0;
            int b = 0;
            String tmp1 = "";
            String tmp2 = "";
            String tmp3 = "";
            switch(inputArr[0]){
                case "print":
                    a = Integer.parseInt(inputArr[1]);
                    b = Integer.parseInt(inputArr[2]);
                    System.out.println(tmp.substring(a,b+1));
                    break;
                case "reverse":
                    a = Integer.parseInt(inputArr[1]);
                    b = Integer.parseInt(inputArr[2]);
                    tmp1 = tmp.substring(0,a);
                    tmp2 = tmp.substring(a,b+1);
                    tmp3 = tmp.substring(b+1,tmp.length());
                    StringBuffer sb = new StringBuffer(tmp2);
                    tmp = tmp1 + sb.reverse() + tmp3;
                    break;
                case "replace":
                    a = Integer.parseInt(inputArr[1]);
                    b = Integer.parseInt(inputArr[2]);
                    String p = inputArr[3];
                    
                    tmp1 = tmp.substring(0,a);
                    tmp3 = tmp.substring(b+1,tmp.length()); 
                    tmp = tmp1 + p + tmp3;
                    break;
            }
        }

    }
}
