public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int K = Integer.parseInt(s.nextLine().split(" ")[1]);
        String Ps = s.nextLine();
        List<Double> p = Arrays.asList(Ps.split(" ")).stream().map(Double::parseDouble).collect(Collectors.toList());
        double ret = 0;
        double tmp = 0;
        for (int i = 0; i < p.size(); i++) {
            double n = p.get(i);
            tmp += n;
            if (i < K) {
                ret += n;
                continue;
            }
            tmp -= p.get(i - K);
            if (ret < tmp) {
                ret = tmp;
            }
        }
        System.out.print((ret + K) / 2);
    }
}