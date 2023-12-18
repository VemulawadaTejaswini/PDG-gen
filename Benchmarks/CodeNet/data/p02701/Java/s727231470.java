import java.util.Scanner;
	public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int num = s.nextInt();
        String[] list = new String[num];
        for(int i =0;i < num;i++){
            list[i] = s.next();
        }
        int result = 1;
        for(int i = 1;i < num;i++){
            int judge = 1;
            for(int j = 0;j < i;j++){
                if(list[i].equals(list[j])){
                    judge = 0;
                }
            }
            if(judge == 1){
                result++;
            }
        }
        System.out.print(result);
    }