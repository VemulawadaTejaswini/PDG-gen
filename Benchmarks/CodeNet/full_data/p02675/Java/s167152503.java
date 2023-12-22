public class Main1 {
    public static void main(String[] args) {
        var arg = Integer.parseInt(args[0]);
        var num = arg % 10;
        String reuslt = null;
        switch (num) {
            case 2:
            case 4:
            case 5:
            case 7:
            case 9:
                reuslt = "hon";
                break;
            case 0:
            case 1:
            case 6:
            case 8:
                reuslt = "pon";
                break;
            case 3:
                reuslt = "bon";
                break;
            default:
                throw new IllegalArgumentException();
        }

        System.out.println(reuslt);
    }
}