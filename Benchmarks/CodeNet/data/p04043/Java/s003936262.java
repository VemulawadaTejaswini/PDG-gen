public class Main {
    public static void main(String args[]) {
        String answer = "YES";
        String[] haiku = args;
        int sum = 0;
        for(int i = 0; i < 3; i++){
          if(haiku[i].equals("7") || haiku[i].equals("5")){
              sum = sum + Integer.valueOf(haiku[i]);
              System.out.println(sum);
          }
          else{
              answer = "NO";
          }
          System.out.println(haiku[i]);
        } 
        if(sum != 17){
            answer = "NO";
        }
        System.out.println(answer);
    }

}