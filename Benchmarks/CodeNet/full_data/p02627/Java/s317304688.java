class Main {

    public static void main(String[] args) {

        Pattern upperCase = Pattern.compile("[A-Z]");
        Pattern lowerCase = Pattern.compile("[a-z]");
        System.out.println("Please input alphabet");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Input alphabet is '" + input + "'.");

        Matcher upperMatcher = upperCase.matcher(input);
        Matcher lowerMatcher = lowerCase.matcher(input);

        if(upperMatcher.find()){
            System.out.println("A");
        }else if(lowerMatcher.find()){
            System.out.println("a");
        }
        sc.close();
    }
}
