public class Main {

    public static void main(String[] args) {

        int count;
        count = 0;

        for(int i=0; i == 0; i++){

            if (args[i].contains("AB")){
                count++;
            }


            String first = args[i].substring(0,0);
            if (first == "A"){
                count++;
                break;
            }

            String end = args[i].substring(args[i].length() - 1);
            if (first == "B"){
                count++;
            }
        }

        System.out.println(count);
    }


}
