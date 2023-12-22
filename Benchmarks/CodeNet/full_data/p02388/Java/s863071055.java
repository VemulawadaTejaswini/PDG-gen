import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
    	BigDecimal value = new BigDecimal(args[0]);
        System.out.println(value.pow(3));
    }
}