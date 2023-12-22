class Main {
  public static void main(String[] args) {
    IntStream.range(1, 9)
      .forEach(i -> {
        IntStream.range(1, 9)
          .forEach(j -> {
            System.out.println(i + "x" + j + "=" + (i * j));
          })
      })
  }
}