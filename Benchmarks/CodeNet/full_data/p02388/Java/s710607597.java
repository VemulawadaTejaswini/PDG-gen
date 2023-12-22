class Main{
    public static void main(String[] args){
        BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
        String x = in.readLine();
        System.out.println(Math.pow(Integer.parseInt(x),3));
    }
}