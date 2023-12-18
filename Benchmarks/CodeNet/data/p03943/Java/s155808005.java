import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        //String input = "10 30 20";
        //String[] input_split = input.split(" ",0);

        String[] input_split = args;
        double[] input_double = Stream.of(input_split).mapToDouble(Integer::parseInt).toArray();
        double half_of_all_candy = (input_double[0] + input_double[1] + input_double[2]) / 2;
        Boolean result_flag = false;

        for (Double input_element : input_double){
            if(input_element == half_of_all_candy)
            {
                result_flag = true;
                break;
            }
            else
            {
                //なにもしない
            }
        }

        if(result_flag == true) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}