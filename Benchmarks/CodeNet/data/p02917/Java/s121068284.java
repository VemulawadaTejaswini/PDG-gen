public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int count = std.nextInt();
        List<Integer> bs = IntStream.range(0, count - 1).map(it -> std.nextInt()).boxed().collect(Collectors.toList());

        int res = min(bs);
        System.out.println(res);
    }

    private static int min(List<Integer> bs) {
        List<Integer> cs = IntStream.range(0, bs.size()).map(it -> 0).boxed().collect(Collectors.toList());
        cs.set(0, bs.get(0));

        for (int i = 1; i < cs.size(); i++) {
            int minVal = Math.min(bs.get(i - 1), bs.get(i));
            cs.set(i, minVal);
        }
        cs.add(bs.get(bs.size() - 1));
        return cs.stream().mapToInt(it -> it).sum();
    }
}