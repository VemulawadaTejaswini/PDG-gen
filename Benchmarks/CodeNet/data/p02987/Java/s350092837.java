class FiftyFifty{
  public String check(String S) {
    char chr1 = S.charAt(0);
    char chr2;

    if (S.charAt(1) == chr1) {
      if (chr1 != S.charAt(2) && S.charAt(2) == S.charAt(3)) {
        return "Yes";
      } else {
        return "No";
      }
    } else {
      chr2 = S.charAt(1);
    }

    if (S.charAt(2) == chr1) {
      if (S.charAt(3) == chr2) {
        return "Yes";
      } else {
        return "No";
      }
    } else if (S.charAt(2) == chr2) {
      if (S.charAt(3) == chr1) {
        return "True";
      } else {
        return "No";
      }
    } else {
      return "No";
    }
  }
}  